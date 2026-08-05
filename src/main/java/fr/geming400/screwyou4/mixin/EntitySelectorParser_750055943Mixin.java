package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.selector.EntitySelectorParser.class)
public class EntitySelectorParser_750055943Mixin {
        @Inject(at = @At("HEAD"), method = "parse()Lnet/minecraft/commands/arguments/selector/EntitySelector;", cancellable = true)
    private void parse_377366382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377366382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getY()Ljava/lang/Double;", cancellable = true)
    private void getY__1002275377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002275377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrder()Ljava/util/function/BiConsumer;", cancellable = true)
    private void getOrder_1572968726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1572968726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)V", cancellable = true)
    private void setLevel__1314394022(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1314394022L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void getLevel_598820884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(598820884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getX()Ljava/lang/Double;", cancellable = true)
    private void getX__1002275377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002275377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getZ()Ljava/lang/Double;", cancellable = true)
    private void getZ__1002275377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002275377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelector()Lnet/minecraft/commands/arguments/selector/EntitySelector;", cancellable = true)
    private void getSelector_377366382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377366382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDistance(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)V", cancellable = true)
    private void setDistance_1882547096(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1882547096L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDistance()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void getDistance_53588580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53588580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setY(D)V", cancellable = true)
    private void setY_1959355309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1959355309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setX(D)V", cancellable = true)
    private void setX_1959355309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1959355309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setZ(D)V", cancellable = true)
    private void setZ_1959355309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1959355309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDeltaZ()Ljava/lang/Double;", cancellable = true)
    private void getDeltaZ__1002275377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002275377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTag()Z", cancellable = true)
    private void isTag_788334525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788334525L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRotX()Lnet/minecraft/advancements/predicates/MinMaxBounds$FloatDegrees;", cancellable = true)
    private void getRotX_370088685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370088685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teamOption()Lnet/minecraft/commands/arguments/selector/options/InvertableSetOptionState;", cancellable = true)
    private void teamOption__1126889611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126889611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRotX(Lnet/minecraft/advancements/predicates/MinMaxBounds$FloatDegrees;)V", cancellable = true)
    private void setRotX_1859332083(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1859332083L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRotY(Lnet/minecraft/advancements/predicates/MinMaxBounds$FloatDegrees;)V", cancellable = true)
    private void setRotY_1859332083(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1859332083L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDeltaY()Ljava/lang/Double;", cancellable = true)
    private void getDeltaY__1002275377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002275377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDeltaZ(D)V", cancellable = true)
    private void setDeltaZ_1959355309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1959355309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setOrder(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void setOrder__988094948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-988094948L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getReader()Lcom/mojang/brigadier/StringReader;", cancellable = true)
    private void getReader__1115844867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1115844867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDeltaX()Ljava/lang/Double;", cancellable = true)
    private void getDeltaX__1002275377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002275377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDeltaX(D)V", cancellable = true)
    private void setDeltaX_1959355309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1959355309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDeltaY(D)V", cancellable = true)
    private void setDeltaY_1959355309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1959355309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "typeOption()Lnet/minecraft/commands/arguments/selector/options/InvertableSetOptionState;", cancellable = true)
    private void typeOption__1126889611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126889611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotY()Lnet/minecraft/advancements/predicates/MinMaxBounds$FloatDegrees;", cancellable = true)
    private void getRotY_370088685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370088685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nameOption()Lnet/minecraft/commands/arguments/selector/options/InvertableSetOptionState;", cancellable = true)
    private void nameOption__1126889611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126889611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldInvertValue()Z", cancellable = true)
    private void shouldInvertValue_788334525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788334525L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addPredicate(Ljava/util/function/Predicate;)V", cancellable = true)
    private void addPredicate_820412488(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(820412488L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSuggestions(Ljava/util/function/BiFunction;)V", cancellable = true)
    private void setSuggestions_1352174458(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1352174458L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scoresOption()Lnet/minecraft/commands/arguments/selector/options/SetOnceOptionState;", cancellable = true)
    private void scoresOption__508876890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508876890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "limitToType(Lnet/minecraft/world/entity/EntityType;)V", cancellable = true)
    private void limitToType_534126200(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(534126200L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "advancementsOption()Lnet/minecraft/commands/arguments/selector/options/SetOnceOptionState;", cancellable = true)
    private void advancementsOption__508876890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508876890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIncludesEntities(Z)V", cancellable = true)
    private void setIncludesEntities_1979672771(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1979672771L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "gamemodeOption()Lnet/minecraft/commands/arguments/selector/options/InvertableSetOptionState;", cancellable = true)
    private void gamemodeOption__1126889611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126889611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMaxResults(I)V", cancellable = true)
    private void setMaxResults_1963972914(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1963972914L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isCurrentEntity()Z", cancellable = true)
    private void isCurrentEntity_788334525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788334525L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setWorldLimited()V", cancellable = true)
    private void setWorldLimited_788330681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(788330681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sortedOption()Lnet/minecraft/commands/arguments/selector/options/SetOnceOptionState;", cancellable = true)
    private void sortedOption__508876890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508876890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "limitedOption()Lnet/minecraft/commands/arguments/selector/options/SetOnceOptionState;", cancellable = true)
    private void limitedOption__508876890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508876890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowSelectors(Ljava/lang/Object;)Z", cancellable = true)
    private static void allowSelectors_2135567953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2135567953L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "allowSelectors(Lnet/minecraft/server/permissions/PermissionSetSupplier;)Z", cancellable = true)
    private static void allowSelectors_1618219400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1618219400L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fillSuggestions(Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;Ljava/util/function/Consumer;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void fillSuggestions__1297885430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1297885430L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
