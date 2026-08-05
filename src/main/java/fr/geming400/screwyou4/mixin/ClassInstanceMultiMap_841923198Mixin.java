package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ClassInstanceMultiMap.class)
public class ClassInstanceMultiMap_841923198Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;)Z", cancellable = true)
    private void remove__2067532336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2067532336L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_880185443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(880185443L))
            info.setReturnValue(-418855952);
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;)Z", cancellable = true)
    private void add__2067532336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2067532336L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1309692835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1309692835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/lang/Object;)Z", cancellable = true)
    private void contains__2067532336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2067532336L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "find(Ljava/lang/Class;)Ljava/util/Collection;", cancellable = true)
    private void find__1943376742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943376742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllInstances()Ljava/util/List;", cancellable = true)
    private void getAllInstances__1826707283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826707283L))
            info.setReturnValue(null);
    }


}
