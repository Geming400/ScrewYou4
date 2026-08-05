package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.LivingEntity.Fallsounds.class)
public class Fallsounds_573457055Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1958969313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958969313L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__562002921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-562002921L))
            info.setReturnValue("rXwr蓾BzGIf缏빏q5!ᤧLDqQ!X땇e)6?Z젍f9=/zTp錈఼OfFSX.(Im,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_611719796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611719796L))
            info.setReturnValue(-918090013);
    }

    @Inject(at = @At("HEAD"), method = "big()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void big_1663669952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1663669952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "small()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void small_1663669952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1663669952L))
            info.setReturnValue(null);
    }


}
