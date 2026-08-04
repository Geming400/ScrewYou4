package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.LevelEntityGetterAdapter.class)
public class LevelEntityGetterAdapter1120941813Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/entity/EntityTypeTest;Lnet/minecraft/world/phys/AABB;Lnet/minecraft/util/AbortableIterationConsumer;)V", cancellable = true)
    private void get__1722730454(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1722730454L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/entity/EntityTypeTest;Lnet/minecraft/util/AbortableIterationConsumer;)V", cancellable = true)
    private void get_1721980965(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1721980965L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/phys/AABB;Ljava/util/function/Consumer;)V", cancellable = true)
    private void get__658525785(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-658525785L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/util/UUID;)Lnet/minecraft/world/level/entity/EntityAccess;", cancellable = true)
    private void get_254209398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(254209398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/world/level/entity/EntityAccess;", cancellable = true)
    private void get_1151458139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1151458139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAll()Ljava/lang/Iterable;", cancellable = true)
    private void getAll__888807875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-888807875L))
            info.setReturnValue(null);
    }


}
