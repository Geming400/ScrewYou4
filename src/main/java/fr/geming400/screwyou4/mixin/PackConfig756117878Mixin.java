package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.WorldLoader.PackConfig.class)
public class PackConfig756117878Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2141630137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2141630137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__379342097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-379342097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_794380620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794380620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initMode()Z", cancellable = true)
    private void initMode_794396461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794396461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "safeMode()Z", cancellable = true)
    private void safeMode_794396461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794396461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createResourceManager()Lcom/mojang/datafixers/util/Pair;", cancellable = true)
    private void createResourceManager_1610225432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1610225432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packRepository()Lnet/minecraft/server/packs/repository/PackRepository;", cancellable = true)
    private void packRepository__755252151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-755252151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initialDataConfig()Lnet/minecraft/world/level/WorldDataConfiguration;", cancellable = true)
    private void initialDataConfig_1673343790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1673343790L))
            info.setReturnValue(null);
    }


}
