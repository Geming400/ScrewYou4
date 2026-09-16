package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityReference.class)
public class EntityReference1312718442Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/entity/EntityReference;Lnet/minecraft/world/level/Level;Ljava/lang/Class;)Lnet/minecraft/world/level/entity/UniquelyIdentifyable;", cancellable = true)
    private static void get__602431038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-602431038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_404091678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(404091678L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1870070037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1870070037L))
            info.setReturnValue(-1490720065);
    }

    @Inject(at = @At("HEAD"), method = "store(Lnet/minecraft/world/entity/EntityReference;Lnet/minecraft/world/level/storage/ValueOutput;Ljava/lang/String;)V", cancellable = true)
    private static void store__709758093(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-709758093L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "store(Lnet/minecraft/world/level/storage/ValueOutput;Ljava/lang/String;)V", cancellable = true)
    private void store__17460355(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-17460355L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/util/UUID;)Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private static void of__281174298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-281174298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/entity/UniquelyIdentifyable;)Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private static void of_835922537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(835922537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/entity/UniquelyIdentifyable;)Z", cancellable = true)
    private void matches__304520649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-304520649L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/world/level/storage/ValueInput;Ljava/lang/String;)Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private static void read_1890476809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1890476809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__491990850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491990850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLivingEntity(Lnet/minecraft/world/entity/EntityReference;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private static void getLivingEntity_293264270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293264270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_173972584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(173972584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUUID()Ljava/util/UUID;", cancellable = true)
    private void getUUID_448665102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(448665102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayer(Lnet/minecraft/world/entity/EntityReference;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private static void getPlayer_466695832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466695832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readWithOldOwnerConversion(Lnet/minecraft/world/level/storage/ValueInput;Ljava/lang/String;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private static void readWithOldOwnerConversion_2116259366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116259366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/world/level/Level;Ljava/lang/Class;)Lnet/minecraft/world/level/entity/UniquelyIdentifyable;", cancellable = true)
    private void getEntity_77942629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(77942629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/world/level/entity/UUIDLookup;Ljava/lang/Class;)Lnet/minecraft/world/level/entity/UniquelyIdentifyable;", cancellable = true)
    private void getEntity_886915266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886915266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/world/entity/EntityReference;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private static void getEntity__658275730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-658275730L))
            info.setReturnValue(null);
    }


}
