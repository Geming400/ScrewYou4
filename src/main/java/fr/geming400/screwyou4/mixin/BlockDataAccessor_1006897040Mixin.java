package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.data.BlockDataAccessor.class)
public class BlockDataAccessor_1006897040Mixin {
        @Inject(at = @At("HEAD"), method = "getData()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getData_91621415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(91621415L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "setData(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void setData__693057415(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-693057415L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getModifiedSuccess()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getModifiedSuccess_1599534566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599534566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPrintSuccess(Lnet/minecraft/nbt/Tag;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrintSuccess_146923862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(146923862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPrintSuccess(Lnet/minecraft/commands/arguments/NbtPathArgument$NbtPath;DI)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrintSuccess__1430477487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1430477487L))
            info.setReturnValue(null);
    }


}
