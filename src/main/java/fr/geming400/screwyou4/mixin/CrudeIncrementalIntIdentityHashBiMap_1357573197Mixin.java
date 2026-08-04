package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CrudeIncrementalIntIdentityHashBiMap.class)
public class CrudeIncrementalIntIdentityHashBiMap_1357573197Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1395835442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1395835442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1395847935(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1395847935L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/util/CrudeIncrementalIntIdentityHashBiMap;", cancellable = true)
    private void copy_414458506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(414458506L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;)I", cancellable = true)
    private void add__1551898674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551898674L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__794042836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-794042836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(I)Z", cancellable = true)
    private void contains__1723473284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1723473284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/lang/Object;)Z", cancellable = true)
    private void contains__1551882337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551882337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId(Ljava/lang/Object;)I", cancellable = true)
    private void getId__1551898674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551898674L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(I)Lnet/minecraft/util/CrudeIncrementalIntIdentityHashBiMap;", cancellable = true)
    private static void create_1268729083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268729083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Ljava/lang/Object;", cancellable = true)
    private void byId__1363610994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1363610994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addMapping(Ljava/lang/Object;I)V", cancellable = true)
    private void addMapping_1386045788(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1386045788L))
            info.cancel();
    }


}
