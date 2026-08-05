package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.trading.VillagerTrades.class)
public class VillagerTrades_577353861Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/item/trading/VillagerTrade;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void register__2059426415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2059426415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void bootstrap__2035558170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035558170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourceKey(Ljava/lang/String;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void resourceKey__1225641545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1225641545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantedItem(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/Holder;ILnet/minecraft/world/item/Item;)Ljava/util/List;", cancellable = true)
    private static void enchantedItem__1527735871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1527735871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantedItem(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderSet;Lnet/minecraft/world/item/Item;)Ljava/util/List;", cancellable = true)
    private static void enchantedItem_1412553676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1412553676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "villagerTypeHolderSet(Lnet/minecraft/core/HolderGetter;Ljava/util/List;)Lnet/minecraft/core/HolderSet;", cancellable = true)
    private static void villagerTypeHolderSet__1180171269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1180171269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "villagerTypeHolderSet(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/HolderSet;", cancellable = true)
    private static void villagerTypeHolderSet_736598160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(736598160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "villagerTypeRestriction(Lnet/minecraft/core/HolderSet;)Ljava/util/Optional;", cancellable = true)
    private static void villagerTypeRestriction__694640587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-694640587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantedBook(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/Holder;I)Ljava/util/List;", cancellable = true)
    private static void enchantedBook__482956066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-482956066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantedBook(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderSet;)Ljava/util/List;", cancellable = true)
    private static void enchantedBook__158842829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-158842829L))
            info.setReturnValue(null);
    }


}
