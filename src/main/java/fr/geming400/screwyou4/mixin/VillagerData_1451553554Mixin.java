package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.npc.villager.VillagerData.class)
public class VillagerData_1451553554Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/Holder;", cancellable = true)
    private void type__92474221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-92474221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_542927285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(542927285L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2072990218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072990218L))
            info.setReturnValue("*\u834FQOx6QoSfkr5y'%J_jB\u224F_/w47M4P}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2008905644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2008905644L))
            info.setReturnValue(-822805494);
    }

    @Inject(at = @At("HEAD"), method = "level()I", cancellable = true)
    private void level_1605615603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605615603L))
            info.setReturnValue(-1302904523);
    }

    @Inject(at = @At("HEAD"), method = "withLevel(I)Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private void withLevel__544320744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-544320744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinXpPerLevel(I)I", cancellable = true)
    private static void getMinXpPerLevel_17748451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(17748451L))
            info.setReturnValue(-97268845);
    }

    @Inject(at = @At("HEAD"), method = "profession()Lnet/minecraft/core/Holder;", cancellable = true)
    private void profession_1188883089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1188883089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxXpPerLevel(I)I", cancellable = true)
    private static void getMaxXpPerLevel_52587765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(52587765L))
            info.setReturnValue(-1654229755);
    }

    @Inject(at = @At("HEAD"), method = "withProfession(Lnet/minecraft/core/HolderGetter$Provider;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private void withProfession_390209878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(390209878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withProfession(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private void withProfession__122488450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-122488450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canLevelUp(I)Z", cancellable = true)
    private static void canLevelUp__42633656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-42633656L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "withType(Lnet/minecraft/core/HolderGetter$Provider;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private void withType__1790376872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790376872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withType(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private void withType_1510242688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510242688L))
            info.setReturnValue(null);
    }


}
