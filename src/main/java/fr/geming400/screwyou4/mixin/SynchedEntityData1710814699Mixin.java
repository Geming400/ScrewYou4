package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.syncher.SynchedEntityData.class)
public class SynchedEntityData1710814699Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;", cancellable = true)
    private void get_891920789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(891920789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)V", cancellable = true)
    private void set_1680031243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1680031243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;Z)V", cancellable = true)
    private void set_799627483(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(799627483L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDirty()Z", cancellable = true)
    private void isDirty_1749093282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1749093282L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "defineId(Ljava/lang/Class;Lnet/minecraft/network/syncher/EntityDataSerializer;)Lnet/minecraft/network/syncher/EntityDataAccessor;", cancellable = true)
    private static void defineId_1734560314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1734560314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packDirty()Ljava/util/List;", cancellable = true)
    private void packDirty__957815781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-957815781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assignValues(Ljava/util/List;)V", cancellable = true)
    private void assignValues_931596111(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(931596111L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNonDefaultValues()Ljava/util/List;", cancellable = true)
    private void getNonDefaultValues__957815781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-957815781L))
            info.setReturnValue(null);
    }


}
