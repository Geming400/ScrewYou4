package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.GameType.class)
public class GameType1945159646Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_809699175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809699175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void values__1290212747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1290212747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void valueOf_1573850738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573850738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_1983421892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983421892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void byName_1573850738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573850738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;Lnet/minecraft/world/level/GameType;)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void byName__1916543317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1916543317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_809699175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809699175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updatePlayerAbilities(Lnet/minecraft/world/entity/player/Abilities;)V", cancellable = true)
    private void updatePlayerAbilities__534956013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-534956013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSurvival()Z", cancellable = true)
    private void isSurvival_1983438229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983438229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCreative()Z", cancellable = true)
    private void isCreative_1983438229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983438229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBlockPlacingRestricted()Z", cancellable = true)
    private void isBlockPlacingRestricted_1983438229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983438229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void byId_1420213155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420213155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShortDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getShortDisplayName__231749519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-231749519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNullableId(Lnet/minecraft/world/level/GameType;)I", cancellable = true)
    private static void getNullableId__2103543261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103543261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byNullableId(I)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void byNullableId_1420213155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420213155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLongDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getLongDisplayName__231749519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-231749519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidId(I)Z", cancellable = true)
    private static void isValidId__1135886586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1135886586L))
            info.setReturnValue(null);
    }


}
