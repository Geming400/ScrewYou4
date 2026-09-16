package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.syncher.SynchedEntityData.class)
public class SynchedEntityData1710814699Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;", cancellable = true)
    private void get__1607218453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1607218453L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V", cancellable = true)
    private void set_1937006569(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1937006569L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;Z)V", cancellable = true)
    private void set_175927997(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(175927997L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDirty()Z", cancellable = true)
    private void isDirty_796981210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796981210L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "defineId(Ljava/lang/Class;Lnet/minecraft/network/syncher/EntityDataSerializer;)Lnet/minecraft/network/syncher/EntityDataAccessor;", cancellable = true)
    private static void defineId__9797564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-9797564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packDirty()Ljava/util/List;", cancellable = true)
    private void packDirty_1974650580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1974650580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNonDefaultValues()Ljava/util/List;", cancellable = true)
    private void getNonDefaultValues_367133319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(367133319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assignValues(Ljava/util/List;)V", cancellable = true)
    private void assignValues_1906023678(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1906023678L))
            info.cancel();
    }


}
