package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.LegacyComponentDataFixUtils.class)
public class LegacyComponentDataFixUtils_603398292Mixin {
        @Inject(at = @At("HEAD"), method = "createEmptyComponent(Lcom/mojang/serialization/DynamicOps;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void createEmptyComponent__1919819898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1919819898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPlainTextComponent(Lcom/mojang/serialization/DynamicOps;Ljava/lang/String;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void createPlainTextComponent_1654057094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1654057094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTextComponentJson(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void createTextComponentJson__1365305338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1365305338L))
            info.setReturnValue("b{\uA3A0\"\uA6CD8,DVW^Gk=rj\uF90FZ!EJG5T{ cz\uACCFI\"qdhJ4=2+(4S,@*7$UCnK\uBDD8\u9630w\u307E;bh7orVx\uCEBD .1:\u1F9Du>xhyE\u4FF9Q2nn}\u2905{Wz");
    }

    @Inject(at = @At("HEAD"), method = "extractTranslationString(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private static void extractTranslationString__831764144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831764144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isStrictlyValidJson(Lcom/mojang/serialization/Dynamic;)Z", cancellable = true)
    private static void isStrictlyValidJson__932041348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932041348L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "rewriteFromLenient(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void rewriteFromLenient_171936907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(171936907L))
            info.setReturnValue("*k;!U\u8D4Deg!\u19D8J+PWP. -.m7o\u445D!_7n7D<\"GG_xj-Fsb[*\u7826:n8\u8945\uBC4E'>\u756AM:\"A\u548EX\uB60BpJ5fQo_4FT \uB7CB5@mh\u804DJq+ uS}pj4(*='EfOk");
    }

    @Inject(at = @At("HEAD"), method = "createTranslatableComponent(Lcom/mojang/serialization/DynamicOps;Ljava/lang/String;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void createTranslatableComponent__294623880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-294623880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTranslatableComponentJson(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void createTranslatableComponentJson_1207273442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1207273442L))
            info.setReturnValue("{!Cv\\\")5,}#Zz2:!\u509C]5pgml:\u8899{pkL\uB4A3?\u43EB)t[y!5^NL1KG\"\uD37DjJk25-C$#`\u43384+ X\uD740.MO\u2587'S&^<COe\u4353_}mx$w\u7F21D[");
    }


}
