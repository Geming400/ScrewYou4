package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.syncher.SynchedEntityData.DataItem.class)
public class DataItem620568846Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/network/syncher/SynchedEntityData$DataValue;", cancellable = true)
    private void value_496907712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(496907712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getValue()Ljava/lang/Object;", cancellable = true)
    private void getValue__1815206231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1815206231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setValue(Ljava/lang/Object;)V", cancellable = true)
    private void setValue_2006076765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2006076765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAccessor()Lnet/minecraft/network/syncher/EntityDataAccessor;", cancellable = true)
    private void getAccessor_154604638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(154604638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDirty()Z", cancellable = true)
    private void isDirty_658847429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(658847429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDirty(Z)V", cancellable = true)
    private void setDirty_1850185675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1850185675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSetToDefault()Z", cancellable = true)
    private void isSetToDefault_658847429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(658847429L))
            info.setReturnValue(null);
    }


}
