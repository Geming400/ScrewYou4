package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.data.StorageDataAccessor.class)
public class StorageDataAccessor1153058718Mixin {
        @Inject(at = @At("HEAD"), method = "getData()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getData_237783094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(237783094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setData(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void setData__546895736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-546895736L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPrintSuccess(Lnet/minecraft/commands/arguments/NbtPathArgument$NbtPath;DI)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrintSuccess__1284315808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1284315808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPrintSuccess(Lnet/minecraft/nbt/Tag;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrintSuccess_293085541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293085541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModifiedSuccess()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getModifiedSuccess_1745696245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745696245L))
            info.setReturnValue(null);
    }


}
