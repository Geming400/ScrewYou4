package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.selector.EntitySelector.class)
public class EntitySelector_161668806Mixin {
        @Inject(at = @At("HEAD"), method = "joinNames(Ljava/util/List;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void joinNames_1889034303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1889034303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findPlayers(Lnet/minecraft/commands/CommandSourceStack;)Ljava/util/List;", cancellable = true)
    private void findPlayers_1804720243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1804720243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findEntities(Lnet/minecraft/commands/CommandSourceStack;)Ljava/util/List;", cancellable = true)
    private void findEntities_1804720243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1804720243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findSinglePlayer(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void findSinglePlayer__643879548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-643879548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxResults()I", cancellable = true)
    private void getMaxResults_199931051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199931051L))
            info.setReturnValue(-921121249);
    }

    @Inject(at = @At("HEAD"), method = "findSingleEntity(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void findSingleEntity__182184435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-182184435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSelfSelector()Z", cancellable = true)
    private void isSelfSelector_199947388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199947388L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "includesEntities()Z", cancellable = true)
    private void includesEntities_199947388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199947388L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "usesSelector()Z", cancellable = true)
    private void usesSelector_199947388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199947388L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isWorldLimited()Z", cancellable = true)
    private void isWorldLimited_199947388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199947388L))
            info.setReturnValue(false);
    }


}
