package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.sounds.SoundEvent.class)
public class SoundEvent332700829Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1718213088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1718213088L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__802759146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-802759146L))
            info.setReturnValue("<aSKO\u0C8C=Sw\uC8C3\u79FE{4W#?973d._\u5EE6NG7x0Z&X_\u8D09fTB\u5187\uD125IW>:L&a{e%KLXta\u19FB\u8B2BpWqZ&{r,ccr_OzV\u7963X%[IB!w\u4CDC\uBD09/rL");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_370963571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370963571L))
            info.setReturnValue(55953665);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void location__2110365724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110365724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRange(F)F", cancellable = true)
    private void getRange_1543831862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543831862L))
            info.setReturnValue(3.903569E8F);
    }

    @Inject(at = @At("HEAD"), method = "createFixedRangeEvent(Lnet/minecraft/resources/Identifier;F)Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private static void createFixedRangeEvent_732055589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(732055589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createVariableRangeEvent(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private static void createVariableRangeEvent__1163891137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163891137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixedRange()Ljava/util/Optional;", cancellable = true)
    private void fixedRange_578162251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(578162251L))
            info.setReturnValue(null);
    }


}
