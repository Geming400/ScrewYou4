package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugBrainDump.class)
public class DebugBrainDump25501763Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__1109958708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1109958708L))
            info.setReturnValue("HXKD:\u7286`Tc1\u87AE:p#,@^8e(lVpA^?wx9\u5021xU\u5F67c<BK\u080C*:\u7DE4)\u9344N:@\uD438 <d\"3\uA06A\u40E29\u0581+B;cdLe.aVmdl\u7D28");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1411014022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411014022L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1109958212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1109958212L))
            info.setReturnValue("=j\u3C46U?B7ufyMr-E`2lHR\uFCC4<\uBFA9c*t2'a60\u7A56V<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_63764505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63764505L))
            info.setReturnValue(-995251359);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__327991358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-327991358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "xp()I", cancellable = true)
    private void xp_63764009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63764009L))
            info.setReturnValue(1902307932);
    }

    @Inject(at = @At("HEAD"), method = "activities()Ljava/util/List;", cancellable = true)
    private void activities_1651838579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1651838579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pois()Ljava/util/Set;", cancellable = true)
    private void pois__1803533723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1803533723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasPoi(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void hasPoi_194272206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(194272206L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "inventory()Ljava/lang/String;", cancellable = true)
    private void inventory__1109958708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1109958708L))
            info.setReturnValue("HXKD:\u7286`Tc1\u87AE:p#,@^8e(lVpA^?wx9\u5021xU\u5F67c<BK\u080C*:\u7DE4)\u9344N:@\uD438 <d\"3\uA06A\u40E29\u0581+B;cdLe.aVmdl\u7D28");
    }

    @Inject(at = @At("HEAD"), method = "health()F", cancellable = true)
    private void health_63761126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63761126L))
            info.setReturnValue(8.259498E8F);
    }

    @Inject(at = @At("HEAD"), method = "potentialPois()Ljava/util/Set;", cancellable = true)
    private void potentialPois__1803533723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1803533723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasPotentialPoi(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void hasPotentialPoi_194272206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(194272206L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "gossips()Ljava/util/List;", cancellable = true)
    private void gossips_1651838579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1651838579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memories()Ljava/util/List;", cancellable = true)
    private void memories_1651838579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1651838579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxHealth()F", cancellable = true)
    private void maxHealth_63761126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63761126L))
            info.setReturnValue(8.259498E8F);
    }

    @Inject(at = @At("HEAD"), method = "takeBrainDump(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/util/debug/DebugBrainDump;", cancellable = true)
    private static void takeBrainDump_2104423282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2104423282L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wantsGolem()Z", cancellable = true)
    private void wantsGolem_63780346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63780346L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "behaviors()Ljava/util/List;", cancellable = true)
    private void behaviors_1651838579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1651838579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "angerLevel()I", cancellable = true)
    private void angerLevel_63764009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63764009L))
            info.setReturnValue(1902307932);
    }

    @Inject(at = @At("HEAD"), method = "profession()Ljava/lang/String;", cancellable = true)
    private void profession__1109958708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1109958708L))
            info.setReturnValue("HXKD:\u7286`Tc1\u87AE:p#,@^8e(lVpA^?wx9\u5021xU\u5F67c<BK\u080C*:\u7DE4)\u9344N:@\uD438 <d\"3\uA06A\u40E29\u0581+B;cdLe.aVmdl\u7D28");
    }


}
