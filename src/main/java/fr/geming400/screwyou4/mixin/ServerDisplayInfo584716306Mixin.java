package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipeManager.ServerDisplayInfo.class)
public class ServerDisplayInfo584716306Mixin {
        @Inject(at = @At("HEAD"), method = "parent()Lnet/minecraft/world/item/crafting/RecipeHolder;", cancellable = true)
    private void parent__912391794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-912391794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__323909962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-323909962L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1355139831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355139831L))
            info.setReturnValue("JMM\uC1BC*0m((\u2156Av_gedh9\uC54Al\uD7E2<lpZLfgMc:e<$[6PK2N@3\uFE99ct:\"s8#Be\uC31D\u8BC3Hl CoL@\u91D6[\uC692M5\uD5D3(PDzRd|[waLjX:r\uBDA1V\uD79E4P\u81A37");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1142068397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142068397L))
            info.setReturnValue(-9223769);
    }

    @Inject(at = @At("HEAD"), method = "display()Lnet/minecraft/world/item/crafting/display/RecipeDisplayEntry;", cancellable = true)
    private void display__34308043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-34308043L))
            info.setReturnValue(null);
    }


}
