package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.RuinedPortalStructure.Setup.class)
public class Setup_1288847005Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1620608033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620608033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_153387029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153387029L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1327109746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327109746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weight()F", cancellable = true)
    private void weight_1327106367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327106367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placement()Lnet/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement;", cancellable = true)
    private void placement_1119823174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119823174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceWithBlackstone()Z", cancellable = true)
    private void replaceWithBlackstone_1327125587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327125587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "airPocketProbability()F", cancellable = true)
    private void airPocketProbability_1327106367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327106367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mossiness()F", cancellable = true)
    private void mossiness_1327106367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327106367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overgrown()Z", cancellable = true)
    private void overgrown_1327125587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327125587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeCold()Z", cancellable = true)
    private void canBeCold_1327125587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327125587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vines()Z", cancellable = true)
    private void vines_1327125587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327125587L))
            info.setReturnValue(null);
    }


}
