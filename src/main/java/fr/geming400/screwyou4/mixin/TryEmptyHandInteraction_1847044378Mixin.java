package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.InteractionResult.TryEmptyHandInteraction.class)
public class TryEmptyHandInteraction_1847044378Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1062410660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062410660L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_711584402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(711584402L))
            info.setReturnValue("p\uA563r,d@1M\u9BDFXRk7L:\u0C60\uA0F2TJH&<yI");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1885307119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1885307119L))
            info.setReturnValue(-408528685);
    }


}
