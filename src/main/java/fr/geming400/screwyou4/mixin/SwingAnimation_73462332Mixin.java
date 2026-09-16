package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.SwingAnimation.class)
public class SwingAnimation_73462332Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/SwingAnimationType;", cancellable = true)
    private void type_1657561146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1657561146L))
            info.setReturnValue(net.minecraft.world.item.SwingAnimationType.WHACK);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__835163937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-835163937L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_843885856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843885856L))
            info.setReturnValue("H6\u8411Nh\u57D3I[vl]@C?YfC\u2687,dPKM^4\u66AEllwKe|WY%J^'2L{}$7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_630814422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(630814422L))
            info.setReturnValue(58852574);
    }

    @Inject(at = @At("HEAD"), method = "duration()I", cancellable = true)
    private void duration_161077005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161077005L))
            info.setReturnValue(-2092267226);
    }


}
