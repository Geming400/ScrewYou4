package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.npc.villager.VillagerData.class)
public class VillagerData_1451553554Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/Holder;", cancellable = true)
    private void type__1294537971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1294537971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1457901484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1457901484L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_316093578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(316093578L))
            info.setReturnValue("\uD237\uCEE5=&R{@fhJuuCpyUy};\u29A6b$\u0F58tS^\uB9D6\uB0FEv\u1701\u934DBY\uAC1E5nR o(x$\"9>E->x;\u604FA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1489816295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1489816295L))
            info.setReturnValue(-1856674766);
    }

    @Inject(at = @At("HEAD"), method = "level()I", cancellable = true)
    private void level_1489815799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1489815799L))
            info.setReturnValue(-1653527346);
    }

    @Inject(at = @At("HEAD"), method = "canLevelUp(I)Z", cancellable = true)
    private static void canLevelUp__1629492679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629492679L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "withType(Lnet/minecraft/core/HolderGetter$Provider;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private void withType_503947640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(503947640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withType(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private void withType__1541708128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1541708128L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withLevel(I)Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private void withLevel_1200221238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200221238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxXpPerLevel(I)I", cancellable = true)
    private static void getMaxXpPerLevel__1629509016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629509016L))
            info.setReturnValue(671775747);
    }

    @Inject(at = @At("HEAD"), method = "withProfession(Lnet/minecraft/core/HolderGetter$Provider;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private void withProfession_503947640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(503947640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withProfession(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private void withProfession__1541708128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1541708128L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinXpPerLevel(I)I", cancellable = true)
    private static void getMinXpPerLevel__1629509016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629509016L))
            info.setReturnValue(673060547);
    }

    @Inject(at = @At("HEAD"), method = "profession()Lnet/minecraft/core/Holder;", cancellable = true)
    private void profession__1294537971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1294537971L))
            info.setReturnValue(null);
    }


}
