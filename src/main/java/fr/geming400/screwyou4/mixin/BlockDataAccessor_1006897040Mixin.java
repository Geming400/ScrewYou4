package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.data.BlockDataAccessor.class)
public class BlockDataAccessor_1006897040Mixin {
        @Inject(at = @At("HEAD"), method = "getData()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getData__563325881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-563325881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setData(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void setData_1567805261(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1567805261L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getModifiedSuccess()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getModifiedSuccess__1170012126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1170012126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPrintSuccess(Lnet/minecraft/nbt/Tag;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrintSuccess__1615467806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1615467806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPrintSuccess(Lnet/minecraft/commands/arguments/NbtPathArgument$NbtPath;DI)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrintSuccess_1022878533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1022878533L))
            info.setReturnValue(null);
    }


}
