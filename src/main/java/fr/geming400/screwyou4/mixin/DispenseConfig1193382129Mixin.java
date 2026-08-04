package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ProjectileItem.DispenseConfig.class)
public class DispenseConfig1193382129Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1716072908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1716072908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_57922154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(57922154L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1231644871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1231644871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/item/ProjectileItem$DispenseConfig$Builder;", cancellable = true)
    private static void builder_310045860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(310045860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "power()F", cancellable = true)
    private void power_1231641492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1231641492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "positionFunction()Lnet/minecraft/world/item/ProjectileItem$PositionFunction;", cancellable = true)
    private void positionFunction__1342493567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1342493567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uncertainty()F", cancellable = true)
    private void uncertainty_1231641492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1231641492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideDispenseEvent()Ljava/util/OptionalInt;", cancellable = true)
    private void overrideDispenseEvent__977189658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-977189658L))
            info.setReturnValue(null);
    }


}
