package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.EntityLookup.class)
public class EntityLookup1600025653Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/world/level/entity/EntityAccess;)V", cancellable = true)
    private void remove_1868112428(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1868112428L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/level/entity/EntityAccess;)V", cancellable = true)
    private void add__1334460983(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1334460983L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_511855212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511855212L))
            info.setReturnValue(583977356);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/level/entity/EntityTypeTest;Lnet/minecraft/util/AbortableIterationConsumer;)V", cancellable = true)
    private void getEntities__1968959858(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1968959858L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Ljava/util/UUID;)Lnet/minecraft/world/level/entity/EntityAccess;", cancellable = true)
    private void getEntity_1359302973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1359302973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity(I)Lnet/minecraft/world/level/entity/EntityAccess;", cancellable = true)
    private void getEntity__1890675468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1890675468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllEntities()Ljava/lang/Iterable;", cancellable = true)
    private void getAllEntities_697381577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(697381577L))
            info.setReturnValue(null);
    }


}
