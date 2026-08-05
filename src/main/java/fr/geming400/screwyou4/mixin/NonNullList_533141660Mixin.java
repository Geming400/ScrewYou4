package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.NonNullList.class)
public class NonNullList_533141660Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Ljava/lang/Object;", cancellable = true)
    private void remove_1967182297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1967182297L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_976873248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(976873248L))
            info.setReturnValue(120770968);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Ljava/lang/Object;", cancellable = true)
    private void get__1815564601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1815564601L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__252686047(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-252686047L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/Object;[Ljava/lang/Object;)Lnet/minecraft/core/NonNullList;", cancellable = true)
    private static void of__670274391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-670274391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(ILjava/lang/Object;)V", cancellable = true)
    private void add_1987657412(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1987657412L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "set(ILjava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void set__1321057569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1321057569L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/core/NonNullList;", cancellable = true)
    private static void create__1202607417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1202607417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSize(ILjava/lang/Object;)Lnet/minecraft/core/NonNullList;", cancellable = true)
    private static void withSize_415897999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415897999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithCapacity(I)Lnet/minecraft/core/NonNullList;", cancellable = true)
    private static void createWithCapacity_1301581558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301581558L))
            info.setReturnValue(null);
    }


}
