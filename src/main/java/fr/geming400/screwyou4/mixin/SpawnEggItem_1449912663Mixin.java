package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.SpawnEggItem.class)
public class SpawnEggItem_1449912663Mixin {
        @Inject(at = @At("HEAD"), method = "getType(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/EntityType;", cancellable = true)
    private static void getType_1781351023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781351023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use__1360187694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1360187694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(Lnet/minecraft/world/entity/EntityType;)Ljava/util/Optional;", cancellable = true)
    private static void byId_995523019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(995523019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnsEntity(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/EntityType;)Z", cancellable = true)
    private static void spawnsEntity_17506394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(17506394L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "spawnOffspringFromSpawnEgg(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/Mob;Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/item/ItemStack;)Ljava/util/Optional;", cancellable = true)
    private static void spawnOffspringFromSpawnEgg__1786763285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1786763285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn_534795429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(534795429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldPrintOpWarning(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void shouldPrintOpWarning_2120571116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2120571116L))
            info.setReturnValue(false);
    }


}
