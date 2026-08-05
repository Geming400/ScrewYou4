package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.SpawnEggItem.class)
public class SpawnEggItem_1449912663Mixin {
        @Inject(at = @At("HEAD"), method = "getType(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/EntityType;", cancellable = true)
    private static void getType_1773277215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1773277215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use_1860288697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1860288697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnsEntity(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/EntityType;)Z", cancellable = true)
    private static void spawnsEntity__501357569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501357569L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "byId(Lnet/minecraft/world/entity/EntityType;)Ljava/util/Optional;", cancellable = true)
    private static void byId_1632569309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632569309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__458930593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-458930593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldPrintOpWarning(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void shouldPrintOpWarning__1033519763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033519763L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "spawnOffspringFromSpawnEgg(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/Mob;Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/item/ItemStack;)Ljava/util/Optional;", cancellable = true)
    private static void spawnOffspringFromSpawnEgg_100173430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(100173430L))
            info.setReturnValue(null);
    }


}
