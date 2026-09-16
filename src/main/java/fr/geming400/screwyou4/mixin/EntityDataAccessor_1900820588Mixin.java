package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.data.EntityDataAccessor.class)
public class EntityDataAccessor_1900820588Mixin {
        @Inject(at = @At("HEAD"), method = "getData()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getData_985544963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(985544963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setData(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void setData_200866133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(200866133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPrintSuccess(Lnet/minecraft/nbt/Tag;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrintSuccess_1040847410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1040847410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPrintSuccess(Lnet/minecraft/commands/arguments/NbtPathArgument$NbtPath;DI)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrintSuccess__536553939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-536553939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModifiedSuccess()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getModifiedSuccess__1801509182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1801509182L))
            info.setReturnValue(null);
    }


}
