package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.DragonFlightHistory.Sample.class)
public class Sample_475678411Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1861190669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861190669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__659781565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659781565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_513941152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(513941152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()D", cancellable = true)
    private void y_513935851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(513935851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot_513937773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(513937773L))
            info.setReturnValue(null);
    }


}
