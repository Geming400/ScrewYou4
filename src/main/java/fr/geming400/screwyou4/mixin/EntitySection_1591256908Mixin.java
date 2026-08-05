package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.EntitySection.class)
public class EntitySection_1591256908Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/world/level/entity/EntityAccess;)Z", cancellable = true)
    private void remove__1454316094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1454316094L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1629519153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629519153L))
            info.setReturnValue(-1609358066);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1629535490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629535490L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/level/entity/EntityAccess;)V", cancellable = true)
    private void add__1454319938(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1454319938L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStatus()Lnet/minecraft/world/level/entity/Visibility;", cancellable = true)
    private void getStatus_1184565741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184565741L))
            info.setReturnValue(net.minecraft.world.level.entity.Visibility.TICKING);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/phys/AABB;Lnet/minecraft/util/AbortableIterationConsumer;)Lnet/minecraft/util/AbortableIterationConsumer$Continuation;", cancellable = true)
    private void getEntities__277399786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-277399786L))
            info.setReturnValue(net.minecraft.util.AbortableIterationConsumer.Continuation.ABORT);
    }

    @Inject(at = @At("HEAD"), method = "getEntities()Ljava/util/stream/Stream;", cancellable = true)
    private void getEntities_1380550592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1380550592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/level/entity/EntityTypeTest;Lnet/minecraft/world/phys/AABB;Lnet/minecraft/util/AbortableIterationConsumer;)Lnet/minecraft/util/AbortableIterationConsumer$Continuation;", cancellable = true)
    private void getEntities__431213026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-431213026L))
            info.setReturnValue(net.minecraft.util.AbortableIterationConsumer.Continuation.ABORT);
    }

    @Inject(at = @At("HEAD"), method = "updateChunkStatus(Lnet/minecraft/world/level/entity/Visibility;)Lnet/minecraft/world/level/entity/Visibility;", cancellable = true)
    private void updateChunkStatus__786461918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-786461918L))
            info.setReturnValue(net.minecraft.world.level.entity.Visibility.TICKING);
    }


}
