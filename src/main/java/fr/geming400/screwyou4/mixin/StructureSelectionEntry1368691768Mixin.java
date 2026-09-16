package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.StructureSet.StructureSelectionEntry.class)
public class StructureSelectionEntry1368691768Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_460065500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(460065500L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2139115293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139115293L))
            info.setReturnValue("O\uB912+`[#-5XD\u4F9E\u8CF1F:@7NaQ*q{MQ\uC29Cero`m'([\uA755M");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1926043859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1926043859L))
            info.setReturnValue(1857912924);
    }

    @Inject(at = @At("HEAD"), method = "weight()I", cancellable = true)
    private void weight__901123418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-901123418L))
            info.setReturnValue(1944870904);
    }

    @Inject(at = @At("HEAD"), method = "structure()Lnet/minecraft/core/Holder;", cancellable = true)
    private void structure_2056286305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2056286305L))
            info.setReturnValue(null);
    }


}
