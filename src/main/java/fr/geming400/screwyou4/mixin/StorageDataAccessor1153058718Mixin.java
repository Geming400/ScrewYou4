package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.data.StorageDataAccessor.class)
public class StorageDataAccessor1153058718Mixin {
        @Inject(at = @At("HEAD"), method = "getData()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getData__417164202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-417164202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setData(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void setData_1713966940(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1713966940L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPrintSuccess(Lnet/minecraft/commands/arguments/NbtPathArgument$NbtPath;DI)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrintSuccess_1169040212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1169040212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPrintSuccess(Lnet/minecraft/nbt/Tag;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrintSuccess__1469306127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1469306127L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModifiedSuccess()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getModifiedSuccess__1023850447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1023850447L))
            info.setReturnValue(null);
    }


}
