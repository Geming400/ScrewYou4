package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.trading.VillagerTrades.class)
public class VillagerTrades_577353861Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/item/trading/VillagerTrade;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void register__970622028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-970622028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void bootstrap_937811256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937811256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourceKey(Ljava/lang/String;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void resourceKey__1024043098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1024043098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantedItem(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderSet;Lnet/minecraft/world/item/Item;)Ljava/util/List;", cancellable = true)
    private static void enchantedItem__60519177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-60519177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantedItem(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/Holder;ILnet/minecraft/world/item/Item;)Ljava/util/List;", cancellable = true)
    private static void enchantedItem__1109157460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1109157460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantedBook(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderSet;)Ljava/util/List;", cancellable = true)
    private static void enchantedBook__1937273646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937273646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantedBook(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/Holder;I)Ljava/util/List;", cancellable = true)
    private static void enchantedBook_797873469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797873469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "villagerTypeHolderSet(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/HolderSet;", cancellable = true)
    private static void villagerTypeHolderSet_1560081382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1560081382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "villagerTypeHolderSet(Lnet/minecraft/core/HolderGetter;Ljava/util/List;)Lnet/minecraft/core/HolderSet;", cancellable = true)
    private static void villagerTypeHolderSet__98599195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-98599195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "villagerTypeRestriction(Lnet/minecraft/core/HolderSet;)Ljava/util/Optional;", cancellable = true)
    private static void villagerTypeRestriction_400078145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(400078145L))
            info.setReturnValue(null);
    }


}
