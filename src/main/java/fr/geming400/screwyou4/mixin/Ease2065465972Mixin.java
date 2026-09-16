package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Ease.class)
public class Ease2065465972Mixin {
        @Inject(at = @At("HEAD"), method = "outQuart(F)F", cancellable = true)
    private static void outQuart_1531732566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1531732566L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inOutSine(F)F", cancellable = true)
    private static void inOutSine__951021157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-951021157L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "outBack(F)F", cancellable = true)
    private static void outBack__1692752486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1692752486L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inOutBack(F)F", cancellable = true)
    private static void inOutBack__1291514763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1291514763L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inQuad(F)F", cancellable = true)
    private static void inQuad__97306863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-97306863L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inOutExpo(F)F", cancellable = true)
    private static void inOutExpo__66089664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-66089664L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "outExpo(F)F", cancellable = true)
    private static void outExpo__467327387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-467327387L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "outBounce(F)F", cancellable = true)
    private static void outBounce__133933317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-133933317L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inQuint(F)F", cancellable = true)
    private static void inQuint_309497003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309497003L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inCubic(F)F", cancellable = true)
    private static void inCubic_1432481130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432481130L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inOutQuart(F)F", cancellable = true)
    private static void inOutQuart_1085200091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1085200091L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inQuart(F)F", cancellable = true)
    private static void inQuart_265537567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(265537567L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inSine(F)F", cancellable = true)
    private static void inSine_1793484759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1793484759L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "outSine(F)F", cancellable = true)
    private static void outSine__1352258880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1352258880L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "outCubic(F)F", cancellable = true)
    private static void outCubic__1596291167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1596291167L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inCirc(F)F", cancellable = true)
    private static void inCirc_1544000225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1544000225L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inOutCirc(F)F", cancellable = true)
    private static void inOutCirc__1200505691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1200505691L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "outQuad(F)F", cancellable = true)
    private static void outQuad_1051916794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1051916794L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inOutCubic(F)F", cancellable = true)
    private static void inOutCubic__2042823642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2042823642L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inOutQuad(F)F", cancellable = true)
    private static void inOutQuad_1453154517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1453154517L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "outCirc(F)F", cancellable = true)
    private static void outCirc__1601743414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1601743414L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inOutQuint(F)F", cancellable = true)
    private static void inOutQuint_1129159527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1129159527L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inElastic(F)F", cancellable = true)
    private static void inElastic__1696150027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1696150027L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inBack(F)F", cancellable = true)
    private static void inBack_1452991153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452991153L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "outElastic(F)F", cancellable = true)
    private static void outElastic__358500756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-358500756L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inBounce(F)F", cancellable = true)
    private static void inBounce__731272622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-731272622L))
            info.setReturnValue(5.776843E8F);
    }

    @Inject(at = @At("HEAD"), method = "inExpo(F)F", cancellable = true)
    private static void inExpo__1616551044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616551044L))
            info.setReturnValue(5.786845E8F);
    }

    @Inject(at = @At("HEAD"), method = "outQuint(F)F", cancellable = true)
    private static void outQuint_1575692002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1575692002L))
            info.setReturnValue(5.786845E8F);
    }

    @Inject(at = @At("HEAD"), method = "inOutBounce(F)F", cancellable = true)
    private static void inOutBounce__1091538154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1091538154L))
            info.setReturnValue(5.786845E8F);
    }

    @Inject(at = @At("HEAD"), method = "inOutElastic(F)F", cancellable = true)
    private static void inOutElastic_20520369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(20520369L))
            info.setReturnValue(5.786845E8F);
    }


}
