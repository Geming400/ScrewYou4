package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.GameType.class)
public class GameType1945159646Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_56312744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(56312744L))
            info.setReturnValue("y*\u061A=a");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void values_920189843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(920189843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void valueOf__1410642022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1410642022L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_286836051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286836051L))
            info.setReturnValue(-1921771816);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;Lnet/minecraft/world/level/GameType;)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void byName__109627731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109627731L))
            info.setReturnValue(net.minecraft.world.level.GameType.CREATIVE);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void byName__692633740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-692633740L))
            info.setReturnValue(net.minecraft.world.level.GameType.SURVIVAL);
    }

    @Inject(at = @At("HEAD"), method = "isValidId(I)Z", cancellable = true)
    private static void isValidId_1320868595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1320868595L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isSurvival()Z", cancellable = true)
    private void isSurvival__40206323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-40206323L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getNullableId(Lnet/minecraft/world/level/GameType;)I", cancellable = true)
    private static void getNullableId__1580772847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1580772847L))
            info.setReturnValue(-344832217);
    }

    @Inject(at = @At("HEAD"), method = "updatePlayerAbilities(Lnet/minecraft/world/entity/player/Abilities;)V", cancellable = true)
    private void updatePlayerAbilities_227978737(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(227978737L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "byNullableId(I)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void byNullableId_810193136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810193136L))
            info.setReturnValue(net.minecraft.world.level.GameType.SURVIVAL);
    }

    @Inject(at = @At("HEAD"), method = "getShortDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getShortDisplayName__914547848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-914547848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLongDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getLongDisplayName__349021492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-349021492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/level/GameType;", cancellable = true)
    private static void byId__350202863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350202863L))
            info.setReturnValue(net.minecraft.world.level.GameType.CREATIVE);
    }

    @Inject(at = @At("HEAD"), method = "isBlockPlacingRestricted()Z", cancellable = true)
    private void isBlockPlacingRestricted__1763770663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1763770663L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_2033368268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2033368268L))
            info.setReturnValue("$1\uCAEF/1'>_vr?\u9E8Ftn5XqYL{D99E%)l]8G\u3B03U}\u8D18EQlpM/S+uCiurQ0:");
    }

    @Inject(at = @At("HEAD"), method = "isCreative()Z", cancellable = true)
    private void isCreative__937149892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937149892L))
            info.setReturnValue(false);
    }


}
