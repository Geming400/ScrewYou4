package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.heightproviders.VeryBiasedToBottomHeight.class)
public class VeryBiasedToBottomHeight201148199Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__934312272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-934312272L))
            info.setReturnValue(" 덻NXX@윲Km_{(PFK\"')=kMtJ)G'CA+<氯ZY+*xjo뮯O`MYWᙓ꓀Ex륇&n!c즘EsOMTmKo*v+^)");
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/VerticalAnchor;Lnet/minecraft/world/level/levelgen/VerticalAnchor;I)Lnet/minecraft/world/level/levelgen/heightproviders/VeryBiasedToBottomHeight;", cancellable = true)
    private static void of_562573734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(562573734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/heightproviders/HeightProviderType;", cancellable = true)
    private void getType__1979443842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1979443842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void sample_166294264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166294264L))
            info.setReturnValue(1307326562);
    }


}
