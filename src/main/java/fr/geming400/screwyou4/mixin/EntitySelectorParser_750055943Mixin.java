package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.selector.EntitySelectorParser.class)
public class EntitySelectorParser_750055943Mixin {
        @Inject(at = @At("HEAD"), method = "parse()Lnet/minecraft/commands/arguments/selector/EntitySelector;", cancellable = true)
    private void parse__207734047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207734047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getY()Ljava/lang/Double;", cancellable = true)
    private void getY__1514908334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1514908334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrder()Ljava/util/function/BiConsumer;", cancellable = true)
    private void getOrder_753190014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(753190014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)V", cancellable = true)
    private void setLevel__356752100(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-356752100L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void getLevel__1679329018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1679329018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getX()Ljava/lang/Double;", cancellable = true)
    private void getX_1535294481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1535294481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getZ()Ljava/lang/Double;", cancellable = true)
    private void getZ__270143853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-270143853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelector()Lnet/minecraft/commands/arguments/selector/EntitySelector;", cancellable = true)
    private void getSelector_1750434307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1750434307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sortedOption()Lnet/minecraft/commands/arguments/selector/options/SetOnceOptionState;", cancellable = true)
    private void sortedOption_503844536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(503844536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldInvertValue()Z", cancellable = true)
    private void shouldInvertValue__1915162315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1915162315L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setMaxResults(I)V", cancellable = true)
    private void setMaxResults_298397222(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(298397222L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWorldLimited()V", cancellable = true)
    private void setWorldLimited__321565745(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-321565745L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSuggestions(Ljava/util/function/BiFunction;)V", cancellable = true)
    private void setSuggestions_1701145127(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1701145127L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "limitToType(Lnet/minecraft/world/entity/EntityType;)V", cancellable = true)
    private void limitToType__1965583768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1965583768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "gamemodeOption()Lnet/minecraft/commands/arguments/selector/options/InvertableSetOptionState;", cancellable = true)
    private void gamemodeOption_115069151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(115069151L))
            info.setReturnValue(new net.minecraft.commands.arguments.selector.options.InvertableSetOptionState());
    }

    @Inject(at = @At("HEAD"), method = "advancementsOption()Lnet/minecraft/commands/arguments/selector/options/SetOnceOptionState;", cancellable = true)
    private void advancementsOption_1519374222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1519374222L))
            info.setReturnValue(new net.minecraft.commands.arguments.selector.options.SetOnceOptionState());
    }

    @Inject(at = @At("HEAD"), method = "isCurrentEntity()Z", cancellable = true)
    private void isCurrentEntity_437035339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437035339L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setIncludesEntities(Z)V", cancellable = true)
    private void setIncludesEntities__516129679(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-516129679L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scoresOption()Lnet/minecraft/commands/arguments/selector/options/SetOnceOptionState;", cancellable = true)
    private void scoresOption_2132355100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2132355100L))
            info.setReturnValue(new net.minecraft.commands.arguments.selector.options.SetOnceOptionState());
    }

    @Inject(at = @At("HEAD"), method = "addPredicate(Ljava/util/function/Predicate;)V", cancellable = true)
    private void addPredicate__2078072206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2078072206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "limitedOption()Lnet/minecraft/commands/arguments/selector/options/SetOnceOptionState;", cancellable = true)
    private void limitedOption_249794453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(249794453L))
            info.setReturnValue(new net.minecraft.commands.arguments.selector.options.SetOnceOptionState());
    }

    @Inject(at = @At("HEAD"), method = "setY(D)V", cancellable = true)
    private void setY_651816612(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(651816612L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setX(D)V", cancellable = true)
    private void setX__235687069(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-235687069L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setZ(D)V", cancellable = true)
    private void setZ_1539320293(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1539320293L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDistance()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void getDistance__1937988657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937988657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowSelectors(Ljava/lang/Object;)Z", cancellable = true)
    private static void allowSelectors_1441244870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441244870L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "allowSelectors(Lnet/minecraft/server/permissions/PermissionSetSupplier;)Z", cancellable = true)
    private static void allowSelectors__1431795139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1431795139L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "fillSuggestions(Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;Ljava/util/function/Consumer;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void fillSuggestions_234177822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(234177822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDistance(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)V", cancellable = true)
    private void setDistance_694075393(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(694075393L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getReader()Lcom/mojang/brigadier/StringReader;", cancellable = true)
    private void getReader__671103708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-671103708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotY()Lnet/minecraft/advancements/predicates/MinMaxBounds$FloatDegrees;", cancellable = true)
    private void getRotY_38623253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(38623253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDeltaZ()Ljava/lang/Double;", cancellable = true)
    private void getDeltaZ__27731353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-27731353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDeltaY()Ljava/lang/Double;", cancellable = true)
    private void getDeltaY__1272495834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1272495834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDeltaY(D)V", cancellable = true)
    private void setDeltaY__906055664(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-906055664L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setOrder(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void setOrder__42856408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-42856408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teamOption()Lnet/minecraft/commands/arguments/selector/options/InvertableSetOptionState;", cancellable = true)
    private void teamOption_1389727911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1389727911L))
            info.setReturnValue(new net.minecraft.commands.arguments.selector.options.InvertableSetOptionState());
    }

    @Inject(at = @At("HEAD"), method = "setRotY(Lnet/minecraft/advancements/predicates/MinMaxBounds$FloatDegrees;)V", cancellable = true)
    private void setRotY_336231895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(336231895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nameOption()Lnet/minecraft/commands/arguments/selector/options/InvertableSetOptionState;", cancellable = true)
    private void nameOption__2028084651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2028084651L))
            info.setReturnValue(new net.minecraft.commands.arguments.selector.options.InvertableSetOptionState());
    }

    @Inject(at = @At("HEAD"), method = "setDeltaZ(D)V", cancellable = true)
    private void setDeltaZ__18551983(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-18551983L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDeltaX(D)V", cancellable = true)
    private void setDeltaX__1793559345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1793559345L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRotX()Lnet/minecraft/advancements/predicates/MinMaxBounds$FloatDegrees;", cancellable = true)
    private void getRotX__915605642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-915605642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "typeOption()Lnet/minecraft/commands/arguments/selector/options/InvertableSetOptionState;", cancellable = true)
    private void typeOption__695287356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695287356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDeltaX()Ljava/lang/Double;", cancellable = true)
    private void getDeltaX_1777706981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1777706981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRotX(Lnet/minecraft/advancements/predicates/MinMaxBounds$FloatDegrees;)V", cancellable = true)
    private void setRotX_819907222(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(819907222L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTag()Z", cancellable = true)
    private void isTag__860053587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-860053587L))
            info.setReturnValue(true);
    }


}
