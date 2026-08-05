package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.NonNullList.class)
public class NonNullList_533141660Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Ljava/lang/Object;", cancellable = true)
    private void remove_2106924765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106924765L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_571403905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(571403905L))
            info.setReturnValue(-420394171);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Ljava/lang/Object;", cancellable = true)
    private void get_2106924765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106924765L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_571416398(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(571416398L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/Object;[Ljava/lang/Object;)Lnet/minecraft/core/NonNullList;", cancellable = true)
    private static void of__427515744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-427515744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(ILjava/lang/Object;)V", cancellable = true)
    private void add_1660901667(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1660901667L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "set(ILjava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void set_1415719169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1415719169L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/core/NonNullList;", cancellable = true)
    private static void create__637020213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-637020213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithCapacity(I)Lnet/minecraft/core/NonNullList;", cancellable = true)
    private static void createWithCapacity__395892686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-395892686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSize(ILjava/lang/Object;)Lnet/minecraft/core/NonNullList;", cancellable = true)
    private static void withSize__1988779178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1988779178L))
            info.setReturnValue(null);
    }


}
