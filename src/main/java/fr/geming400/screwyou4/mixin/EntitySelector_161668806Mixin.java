package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.selector.EntitySelector.class)
public class EntitySelector_161668806Mixin {
        @Inject(at = @At("HEAD"), method = "usesSelector()Z", cancellable = true)
    private void usesSelector__769105007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-769105007L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isWorldLimited()Z", cancellable = true)
    private void isWorldLimited_774348746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(774348746L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "findSinglePlayer(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void findSinglePlayer__1312028378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1312028378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findEntities(Lnet/minecraft/commands/CommandSourceStack;)Ljava/util/List;", cancellable = true)
    private void findEntities_136664217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(136664217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findSingleEntity(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void findSingleEntity_1412272049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1412272049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findPlayers(Lnet/minecraft/commands/CommandSourceStack;)Ljava/util/List;", cancellable = true)
    private void findPlayers_1407341466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407341466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSelfSelector()Z", cancellable = true)
    private void isSelfSelector_1791368199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1791368199L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getMaxResults()I", cancellable = true)
    private void getMaxResults__635283517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-635283517L))
            info.setReturnValue(-918941165);
    }

    @Inject(at = @At("HEAD"), method = "includesEntities()Z", cancellable = true)
    private void includesEntities__934859184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-934859184L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "joinNames(Ljava/util/List;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void joinNames_1361816317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1361816317L))
            info.setReturnValue(null);
    }


}
