package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.syncher.SynchedEntityData.DataItem.class)
public class DataItem620568846Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/network/syncher/SynchedEntityData$DataValue;", cancellable = true)
    private void value__1384760785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1384760785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getValue()Ljava/lang/Object;", cancellable = true)
    private void getValue_1874858020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874858020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setValue(Ljava/lang/Object;)V", cancellable = true)
    private void setValue_348583502(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(348583502L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAccessor()Lnet/minecraft/network/syncher/EntityDataAccessor;", cancellable = true)
    private void getAccessor_1395981403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1395981403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDirty()Z", cancellable = true)
    private void isDirty__293264643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293264643L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setDirty(Z)V", cancellable = true)
    private void setDirty_1397510235(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1397510235L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSetToDefault()Z", cancellable = true)
    private void isSetToDefault_300532791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(300532791L))
            info.setReturnValue(false);
    }


}
