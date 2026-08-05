package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.CommonPlayerSpawnInfo.class)
public class CommonPlayerSpawnInfo_741118625Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__167507644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-167507644L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1511542149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511542149L))
            info.setReturnValue(",\u3416t+>x\u1DB1h^t3\u04A7q!\uC69CX9np'vq/(d5`pWVwMM:ib^'\u88B9^\uCC66.n\u35CAA\u8A3Aw\u9937\u2CD7|@:=.85Vy\u9321gi");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1298470715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298470715L))
            info.setReturnValue(-1966089881);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/RegistryFriendlyByteBuf;)V", cancellable = true)
    private void write_642753371(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(642753371L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDebug()Z", cancellable = true)
    private void isDebug_1019153070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1019153070L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "seed()J", cancellable = true)
    private void seed_1317207158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317207158L))
            info.setReturnValue(2651464838461713931L);
    }

    @Inject(at = @At("HEAD"), method = "previousGameType()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void previousGameType_260218857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(260218857L))
            info.setReturnValue(net.minecraft.world.level.GameType.CREATIVE);
    }

    @Inject(at = @At("HEAD"), method = "lastDeathLocation()Ljava/util/Optional;", cancellable = true)
    private void lastDeathLocation_2038881953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2038881953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "portalCooldown()I", cancellable = true)
    private void portalCooldown__2076114193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2076114193L))
            info.setReturnValue(-221035329);
    }

    @Inject(at = @At("HEAD"), method = "dimensionType()Lnet/minecraft/core/Holder;", cancellable = true)
    private void dimensionType__526220068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-526220068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFlat()Z", cancellable = true)
    private void isFlat_740535924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(740535924L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "dimension()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void dimension_905152811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(905152811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameType()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void gameType__1625584942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1625584942L))
            info.setReturnValue(net.minecraft.world.level.GameType.CREATIVE);
    }

    @Inject(at = @At("HEAD"), method = "seaLevel()I", cancellable = true)
    private void seaLevel_1153900849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1153900849L))
            info.setReturnValue(867210272);
    }


}
