package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ConversionParams.class)
public class ConversionParams1894912856Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/entity/ConversionType;", cancellable = true)
    private void type_730067505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730067505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1014542181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1014542181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_759452881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(759452881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1933175598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933175598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "single(Lnet/minecraft/world/entity/Mob;ZZ)Lnet/minecraft/world/entity/ConversionParams;", cancellable = true)
    private static void single_834256775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834256775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "team()Lnet/minecraft/world/scores/PlayerTeam;", cancellable = true)
    private void team_694025153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(694025153L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keepEquipment()Z", cancellable = true)
    private void keepEquipment_1933191439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933191439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preserveCanPickUpLoot()Z", cancellable = true)
    private void preserveCanPickUpLoot_1933191439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933191439L))
            info.setReturnValue(null);
    }


}
