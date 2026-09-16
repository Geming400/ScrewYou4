package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.SculkPatchConfiguration.class)
public class SculkPatchConfiguration43339668Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__865286600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-865286600L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_813763193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813763193L))
            info.setReturnValue("`*ZZEr7W_Q0!BRTb1?R8kRW}q|33GT+,N::rzqI\u7ACC\"^$>PUZh4i>[t&F/M\u8890W&8yL4\u76BB5ad{$d!JcA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_600691759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(600691759L))
            info.setReturnValue(-1718630455);
    }

    @Inject(at = @At("HEAD"), method = "catalystChance()F", cancellable = true)
    private void catalystChance__2117619894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2117619894L))
            info.setReturnValue(3.710394E8F);
    }

    @Inject(at = @At("HEAD"), method = "amountPerCharge()I", cancellable = true)
    private void amountPerCharge__827045791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-827045791L))
            info.setReturnValue(489757144);
    }

    @Inject(at = @At("HEAD"), method = "extraRareGrowths()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void extraRareGrowths_2002482307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2002482307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spreadAttempts()I", cancellable = true)
    private void spreadAttempts__842618047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-842618047L))
            info.setReturnValue(-1667820656);
    }

    @Inject(at = @At("HEAD"), method = "growthRounds()I", cancellable = true)
    private void growthRounds__2059536466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2059536466L))
            info.setReturnValue(1294402661);
    }

    @Inject(at = @At("HEAD"), method = "spreadRounds()I", cancellable = true)
    private void spreadRounds__477453182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-477453182L))
            info.setReturnValue(2110756777);
    }

    @Inject(at = @At("HEAD"), method = "chargeCount()I", cancellable = true)
    private void chargeCount__1758637153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1758637153L))
            info.setReturnValue(2047386801);
    }


}
