package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.SpeleothemConfiguration.class)
public class SpeleothemConfiguration42920590Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__865705678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-865705678L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_813344115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813344115L))
            info.setReturnValue("%YVS\u4E3BDn'@a*t6&@*\u98A4]urp\u4C2DU=S\uCFE8U[Yr\uFF3FF;_-\u0469Uv*\uAFFE0|},eg\uA119M%qgsOy7Ec.F\u1CE9T45a<ER9u*a;\u8D59YLgv\u718F]-cMhp7%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_600272681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(600272681L))
            info.setReturnValue(1120269756);
    }

    @Inject(at = @At("HEAD"), method = "replaceableBlocks()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void replaceableBlocks_1271359574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1271359574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseBlock()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void baseBlock__788673096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-788673096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pointedBlock()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void pointedBlock_75686810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(75686810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chanceOfDirectionalSpread()F", cancellable = true)
    private void chanceOfDirectionalSpread__373981345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-373981345L))
            info.setReturnValue(1.890412E8F);
    }

    @Inject(at = @At("HEAD"), method = "chanceOfSpreadRadius3()F", cancellable = true)
    private void chanceOfSpreadRadius3__1756033906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1756033906L))
            info.setReturnValue(1.890412E8F);
    }

    @Inject(at = @At("HEAD"), method = "chanceOfSpreadRadius2()F", cancellable = true)
    private void chanceOfSpreadRadius2__1784663057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1784663057L))
            info.setReturnValue(1.890412E8F);
    }

    @Inject(at = @At("HEAD"), method = "chanceOfTallerGeneration()F", cancellable = true)
    private void chanceOfTallerGeneration_534428212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(534428212L))
            info.setReturnValue(1.890412E8F);
    }


}
