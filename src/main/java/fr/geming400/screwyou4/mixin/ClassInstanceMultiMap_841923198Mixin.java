package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ClassInstanceMultiMap.class)
public class ClassInstanceMultiMap_841923198Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;)Z", cancellable = true)
    private void remove_2087692492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2087692492L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1285654786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1285654786L))
            info.setReturnValue(1394227538);
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;)Z", cancellable = true)
    private void add_1268144143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268144143L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1818965301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818965301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/lang/Object;)Z", cancellable = true)
    private void contains_1073876177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1073876177L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "find(Ljava/lang/Class;)Ljava/util/Collection;", cancellable = true)
    private void find_38501697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(38501697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllInstances()Ljava/util/List;", cancellable = true)
    private void getAllInstances_1778892160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1778892160L))
            info.setReturnValue(null);
    }


}
