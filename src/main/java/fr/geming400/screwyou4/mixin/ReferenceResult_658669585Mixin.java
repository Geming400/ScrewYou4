package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrIdArgument.ReferenceResult.class)
public class ReferenceResult_658669585Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2044181843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044181843L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__476790391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476790391L))
            info.setReturnValue("xn [Mt-쬭䐌}sPS\"돊O&dhN-z!尤VHp9>B7[軭嚊` [却$kwJ/3m`⬽\"uhT(7伝Rj()8P*DoY UV=h&<m嫈':V6ꐧ\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_696932326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(696932326L))
            info.setReturnValue(119570576);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void key_1467160897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467160897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/ImmutableStringReader;Lnet/minecraft/core/HolderLookup$Provider;Lcom/mojang/serialization/DynamicOps;Lcom/mojang/serialization/Codec;Lnet/minecraft/core/HolderLookup$RegistryLookup;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void parse_1436563057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1436563057L))
            info.setReturnValue(null);
    }


}
