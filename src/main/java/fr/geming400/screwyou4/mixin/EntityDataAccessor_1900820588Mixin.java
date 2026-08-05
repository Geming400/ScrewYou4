package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.data.EntityDataAccessor.class)
public class EntityDataAccessor_1900820588Mixin {
        @Inject(at = @At("HEAD"), method = "getData()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getData_330597667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(330597667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModifiedSuccess()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getModifiedSuccess__276088578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-276088578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPrintSuccess(Lnet/minecraft/nbt/Tag;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrintSuccess__721544258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721544258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPrintSuccess(Lnet/minecraft/commands/arguments/NbtPathArgument$NbtPath;DI)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrintSuccess_1916802081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1916802081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setData(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void setData__1833238487(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1833238487L))
            info.cancel();
    }


}
