package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootContext.class)
public class LootContext_1433872359Mixin {
        @Inject(at = @At("HEAD"), method = "getRandom()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void getRandom__615752525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615752525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParameter(Lnet/minecraft/util/context/ContextKey;)Ljava/lang/Object;", cancellable = true)
    private void getParameter__1266158989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1266158989L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel_2101410358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101410358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "popVisitedElement(Lnet/minecraft/world/level/storage/loot/LootContext$VisitedEntry;)V", cancellable = true)
    private void popVisitedElement__1030039500(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1030039500L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createVisitedEntry(Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition;)Lnet/minecraft/world/level/storage/loot/LootContext$VisitedEntry;", cancellable = true)
    private static void createVisitedEntry_1200371737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200371737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createVisitedEntry(Lnet/minecraft/world/level/storage/loot/LootTable;)Lnet/minecraft/world/level/storage/loot/LootContext$VisitedEntry;", cancellable = true)
    private static void createVisitedEntry_1887526214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1887526214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createVisitedEntry(Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;)Lnet/minecraft/world/level/storage/loot/LootContext$VisitedEntry;", cancellable = true)
    private static void createVisitedEntry__1070432161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1070432161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushVisitedElement(Lnet/minecraft/world/level/storage/loot/LootContext$VisitedEntry;)Z", cancellable = true)
    private void pushVisitedElement__1030035656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1030035656L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasParameter(Lnet/minecraft/util/context/ContextKey;)Z", cancellable = true)
    private void hasParameter__594973077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-594973077L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getResolver()Lnet/minecraft/core/HolderGetter$Provider;", cancellable = true)
    private void getResolver__1794544686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1794544686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addDynamicDrops(Lnet/minecraft/resources/Identifier;Ljava/util/function/Consumer;)V", cancellable = true)
    private void addDynamicDrops__533023557(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-533023557L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLuck()F", cancellable = true)
    private void getLuck_1472131721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1472131721L))
            info.setReturnValue(3.8331E7F);
    }

    @Inject(at = @At("HEAD"), method = "getOptionalParameter(Lnet/minecraft/util/context/ContextKey;)Ljava/lang/Object;", cancellable = true)
    private void getOptionalParameter__1266158989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1266158989L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "hasVisitedElement(Lnet/minecraft/world/level/storage/loot/LootContext$VisitedEntry;)Z", cancellable = true)
    private void hasVisitedElement__1030035656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1030035656L))
            info.setReturnValue(false);
    }


}
