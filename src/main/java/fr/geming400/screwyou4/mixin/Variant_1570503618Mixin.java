package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.axolotl.Axolotl.Variant.class)
public class Variant_1570503618Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__318343285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-318343285L))
            info.setReturnValue("i|");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/axolotl/Axolotl$Variant;", cancellable = true)
    private static void values_1434363430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1434363430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/axolotl/Axolotl$Variant;", cancellable = true)
    private static void valueOf__1290225089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1290225089L))
            info.setReturnValue(net.minecraft.world.entity.animal.axolotl.Axolotl.Variant.BLUE);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__87819978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-87819978L))
            info.setReturnValue(-1087753724);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/axolotl/Axolotl$Variant;", cancellable = true)
    private static void byId_1396219880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1396219880L))
            info.setReturnValue(net.minecraft.world.entity.animal.axolotl.Axolotl.Variant.GOLD);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1658712239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658712239L))
            info.setReturnValue("\u819EiyY>UfLU \uA215XZK|W%p)f\u98132Z'4}y)F\u0F27$B}Hl?\uB809\u62EAu;.!");
    }

    @Inject(at = @At("HEAD"), method = "getCommonSpawnVariant(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/entity/animal/axolotl/Axolotl$Variant;", cancellable = true)
    private static void getCommonSpawnVariant__394700152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-394700152L))
            info.setReturnValue(net.minecraft.world.entity.animal.axolotl.Axolotl.Variant.WILD);
    }

    @Inject(at = @At("HEAD"), method = "getRareSpawnVariant(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/entity/animal/axolotl/Axolotl$Variant;", cancellable = true)
    private static void getRareSpawnVariant_604787775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(604787775L))
            info.setReturnValue(net.minecraft.world.entity.animal.axolotl.Axolotl.Variant.WILD);
    }


}
