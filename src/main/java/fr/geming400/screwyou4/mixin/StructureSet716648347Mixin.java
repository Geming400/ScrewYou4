package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.StructureSet.class)
public class StructureSet716648347Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__191977921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-191977921L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1487071872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487071872L))
            info.setReturnValue("rC\uA461}&\u5F41b?1O'W\u292C\u54F86\u633FbYnEAK\uA5BA{6])=X=q\uA0BBlu[KBANO\u6237e\u01D5$z\uABADh/p}T\u7829x05Npv\u2F96NWg%.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1274000438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1274000438L))
            info.setReturnValue(357809919);
    }

    @Inject(at = @At("HEAD"), method = "entry(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/levelgen/structure/StructureSet$StructureSelectionEntry;", cancellable = true)
    private static void entry_327488913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(327488913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entry(Lnet/minecraft/core/Holder;I)Lnet/minecraft/world/level/levelgen/structure/StructureSet$StructureSelectionEntry;", cancellable = true)
    private static void entry__1679528472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1679528472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structures()Ljava/util/List;", cancellable = true)
    private void structures__1883164885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1883164885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placement()Lnet/minecraft/world/level/levelgen/structure/placement/StructurePlacement;", cancellable = true)
    private void placement__645844293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-645844293L))
            info.setReturnValue(null);
    }


}
