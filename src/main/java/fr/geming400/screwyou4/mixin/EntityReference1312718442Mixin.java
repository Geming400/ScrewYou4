package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityReference.class)
public class EntityReference1312718442Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/entity/EntityReference;Lnet/minecraft/world/level/Level;Ljava/lang/Class;)Lnet/minecraft/world/level/entity/UniquelyIdentifyable;", cancellable = true)
    private static void get__1471609768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1471609768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1596737091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1596737091L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1350980688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350980688L))
            info.setReturnValue(1379550352);
    }

    @Inject(at = @At("HEAD"), method = "store(Lnet/minecraft/world/entity/EntityReference;Lnet/minecraft/world/level/storage/ValueOutput;Ljava/lang/String;)V", cancellable = true)
    private static void store__569025326(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-569025326L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "store(Lnet/minecraft/world/level/storage/ValueOutput;Ljava/lang/String;)V", cancellable = true)
    private void store__656666788(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-656666788L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/util/UUID;)Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private static void of__363345649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-363345649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/entity/UniquelyIdentifyable;)Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private static void of_717837344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(717837344L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/entity/UniquelyIdentifyable;)Z", cancellable = true)
    private void matches__731422844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-731422844L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/world/level/storage/ValueInput;Ljava/lang/String;)Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private static void read_1984331123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1984331123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/world/entity/EntityReference;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private static void getEntity__722186731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-722186731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/world/level/Level;Ljava/lang/Class;)Lnet/minecraft/world/level/entity/UniquelyIdentifyable;", cancellable = true)
    private void getEntity__412925538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-412925538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/world/level/entity/UUIDLookup;Ljava/lang/Class;)Lnet/minecraft/world/level/entity/UniquelyIdentifyable;", cancellable = true)
    private void getEntity__613636741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-613636741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_920753064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(920753064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec__1721248482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1721248482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLivingEntity(Lnet/minecraft/world/entity/EntityReference;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private static void getLivingEntity_2070267820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2070267820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUUID()Ljava/util/UUID;", cancellable = true)
    private void getUUID_1723852925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1723852925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayer(Lnet/minecraft/world/entity/EntityReference;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private static void getPlayer__795603249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-795603249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readWithOldOwnerConversion(Lnet/minecraft/world/level/storage/ValueInput;Ljava/lang/String;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private static void readWithOldOwnerConversion_1547566596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1547566596L))
            info.setReturnValue(null);
    }


}
