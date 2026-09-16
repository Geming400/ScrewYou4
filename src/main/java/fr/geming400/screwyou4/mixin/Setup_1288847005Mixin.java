package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.RuinedPortalStructure.Setup.class)
public class Setup_1288847005Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_380220736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(380220736L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2059270529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059270529L))
            info.setReturnValue("A/E\u5AFFs1W6\uB434'Q38g3\u8F4Br6eh.\u22928j:(+]\u287Fpg\u0622Yf\u7900Ltgg\"ePjnW=h2I6g):a\u812B\u7F5C3ISzn2YcE>TtL<Fn\u0AC9B\u4389)\uCC47\uC139\u1140l\uCC63# {%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1846199095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846199095L))
            info.setReturnValue(-1685692252);
    }

    @Inject(at = @At("HEAD"), method = "airPocketProbability()F", cancellable = true)
    private void airPocketProbability__1171134006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1171134006L))
            info.setReturnValue(4.169928E8F);
    }

    @Inject(at = @At("HEAD"), method = "weight()F", cancellable = true)
    private void weight__980971065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-980971065L))
            info.setReturnValue(4.169928E8F);
    }

    @Inject(at = @At("HEAD"), method = "vines()Z", cancellable = true)
    private void vines__19269654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-19269654L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "placement()Lnet/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement;", cancellable = true)
    private void placement__1672844543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672844543L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.structures.RuinedPortalPiece.VerticalPlacement.ON_LAND_SURFACE);
    }

    @Inject(at = @At("HEAD"), method = "replaceWithBlackstone()Z", cancellable = true)
    private void replaceWithBlackstone_757719891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757719891L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canBeCold()Z", cancellable = true)
    private void canBeCold__300242692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-300242692L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "overgrown()Z", cancellable = true)
    private void overgrown_855285324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(855285324L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mossiness()F", cancellable = true)
    private void mossiness__1477835775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1477835775L))
            info.setReturnValue(4.169928E8F);
    }


}
